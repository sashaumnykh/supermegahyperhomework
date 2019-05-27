package ru.spbu.apmath.armchair_traveler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static ru.spbu.apmath.armchair_traveler.Logic.*;


public class Main {

    static String startURL = "C://Users//Александра//IdeaProjects//sem2//image//start.png";
    static String logoURL = "C://Users//Александра//IdeaProjects//sem2//image//logo.jpg";
    static String logo2URL = "C://Users//Александра//IdeaProjects//sem2//image//logo2.jpg";
    static String emptyURL = "C://Users//Александра//IdeaProjects//sem2//image//empty.jpg";
    static String usedURL = "C://Users//Александра//IdeaProjects//sem2//image//used.jpg";
    static String level1URL = "C://Users//Александра//IdeaProjects//sem2//image//level1.jpg";
    static String level2URL = "C://Users//Александра//IdeaProjects//sem2//image//level2.jpg";
    static String level3URL = "C://Users//Александра//IdeaProjects//sem2//image//level3.jpg";
    static String backURL = "C://Users//Александра//IdeaProjects//sem2//image//back.jpg";
    static String enterURL = "C://Users//Александра//IdeaProjects//sem2//image//enter.jpg";
    static String emptyButURL = "C://Users//Александра//IdeaProjects//sem2//image//empty_but.jpg";
    static String helpURL = "C://Users//Александра//IdeaProjects//sem2//image//help.jpg";

    private static JPanel jPanel;
    private static int level;
    private static String city;
    //private static String citiesURL = "C://Users//Александра//IdeaProjects//sem2//src//ru//spbu//apmath//armchair_traveler//cities1.txt";
    private static String citiesURL;
    private static List<String> cities;
    private static JTextField inputField;
    private static char lastChar = '\0';
    private static List<String> used = new ArrayList<String>();
    private static JLabel answerLabel;
    private static JLabel usedLabel;
    private static JTextArea textArea;
    private static JScrollPane scrollPane;
    private static String address;
    private static JFrame gameWindow;
    private static JButton inputButton;
    private static String nextWord;
    private static String helpfulWord;
    private static Boolean signal;

    public static void main (String [] args) throws IOException {
        gameWindow = new JFrame("Armchair traveler");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight() - 40;
        gameWindow.setSize(width, height);
        gameWindow.setExtendedState(gameWindow.MAXIMIZED_BOTH);
        gameWindow.setDefaultCloseOperation(gameWindow.EXIT_ON_CLOSE);
        jPanel = new JPanel();
        jPanel.setBackground(Color.white);
        jPanel.setLayout(new BorderLayout());
        gameWindow.add(jPanel);

        JButton starter = new JButton();
        //starter.setPreferredSize(new Dimension(493,150));
        starter.setIcon(new ImageIcon(startURL));
        starter.setBorder(BorderFactory.createEmptyBorder());
        starter.setContentAreaFilled(false);

        starter.addActionListener(Main::levelChoiceScene);
        jPanel.add(starter, BorderLayout.CENTER);

        JLabel logo = new JLabel(new ImageIcon(logoURL));
        //logo.setPreferredSize(new Dimension(763,300));
        jPanel.add(logo, BorderLayout.NORTH);

        gameWindow.setVisible(true);
    }

    private static void levelChoiceScene(ActionEvent e)
    {
        lastChar = '\0';
        used.clear();
        signal = false;

        JButton level1 = new JButton();
        level1.setIcon(new ImageIcon(level1URL));
        level1.setBorder(BorderFactory.createEmptyBorder());
        level1.setContentAreaFilled(false);
        level1.setSize(335, 75);
        level1.addActionListener(Main::game1level);
        level1.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton level2 = new JButton();
        level2.setIcon(new ImageIcon(level2URL));
        level2.setBorder(BorderFactory.createEmptyBorder());
        level2.setContentAreaFilled(false);
        //level2.setSize(335, 75);
        level2.addActionListener(Main::game2level);
        level2.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton level3 = new JButton();
        level3.setIcon(new ImageIcon(level3URL));
        level3.setBorder(BorderFactory.createEmptyBorder());
        level3.setContentAreaFilled(false);
        //level3.setSize(335, 75);
        level3.addActionListener(Main::game3level);
        level3.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel descr1 = new JLabel("Города России с численностью более 100 тысяч человек");
        descr1.setFont(new Font("Montserrat", Font.ITALIC, 13));
        descr1.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel descr2 = new JLabel("Города России с численностью более 50 тысяч человек");
        descr2.setFont(new Font("Montserrat", Font.ITALIC, 13));
        descr2.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel descr3 = new JLabel("Столицы мира и города (известные мне)");
        descr3.setFont(new Font("Montserrat", Font.ITALIC, 13));
        descr3.setAlignmentX(Component.CENTER_ALIGNMENT);

        jPanel.removeAll();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        JLabel logoLabel = new JLabel(new ImageIcon(logoURL));
        logoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel emptyLabel = new JLabel(new ImageIcon(emptyButURL));
        emptyLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel emptyLabel2 = new JLabel(new ImageIcon(emptyURL));
        emptyLabel2.setAlignmentX(Component.CENTER_ALIGNMENT);

        jPanel.add(logoLabel);
        jPanel.add(emptyLabel);
        jPanel.add(level1);
        jPanel.add(descr1);
        jPanel.add(new JLabel(new ImageIcon(emptyURL)));
        jPanel.add(level2);
        jPanel.add(descr2);
        jPanel.add(emptyLabel2);
        jPanel.add(level3);
        jPanel.add(descr3);

        jPanel.updateUI();
    }

    private static void game1level(ActionEvent e)
    {
        citiesURL = "C://Users//Александра//IdeaProjects//sem2//src//ru//spbu//apmath//armchair_traveler//1//cities1.txt";
        level = 1;
        drawGameArea(citiesURL);
    }

    private static void game2level(ActionEvent e)
    {
        citiesURL = "C://Users//Александра//IdeaProjects//sem2//src//ru//spbu//apmath//armchair_traveler//2//cities2.txt";
        level = 2;
        drawGameArea(citiesURL);
    }

    private static void game3level(ActionEvent ae)
    {
        citiesURL = "C://Users//Александра//IdeaProjects//sem2//src//ru//spbu//apmath//armchair_traveler//3//cities3.txt";
        level = 3;
        drawGameArea(citiesURL);
    }

    private static void drawGameArea(String citiesURL)
    {
        jPanel.removeAll();
        jPanel.setLayout(new GridBagLayout());
        try
        {
            BufferedReader in = new BufferedReader(new FileReader(citiesURL));
            cities = new ArrayList<>();
            String avCity = in.readLine();
            while (avCity != null)
            {
                cities.add(avCity);
                avCity = in.readLine();
            }
        }
        catch (IOException ex)
        {
            System.out.println("Такого уровня нет :(");
        }

        GridBagConstraints constraints = new GridBagConstraints();
        //constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.gridwidth = 1;
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.weightx = 0.75;
        constraints.weighty = 0.2;
        JLabel logoLabel = new JLabel(new ImageIcon(logo2URL));
        jPanel.add(logoLabel, constraints);


        constraints = new GridBagConstraints();
        //constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(10, 10, 10, 10);
        //constraints.gridheight = 1;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0.25;
        constraints.weighty = 0.1;
        usedLabel = new JLabel(new ImageIcon(usedURL));
        jPanel.add(usedLabel, constraints, SwingConstants.CENTER);

        constraints = new GridBagConstraints();
        //constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.gridheight = 2;
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.weightx = 0.25;
        constraints.weighty = 0.6;
        textArea = new JTextArea("",19, 24);
        textArea.setFont(new Font("Montserrat", Font.ITALIC, 15));
        scrollPane = new JScrollPane(textArea);
        textArea.setEditable(false);
        jPanel.add(scrollPane, constraints, SwingConstants.CENTER);

        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.weightx = 0.75;
        constraints.weighty = 0.7;
        answerLabel = new JLabel("Ваш ход:", SwingConstants.CENTER);
        answerLabel.setFont(new Font("Montserrat", Font.ITALIC, 60));
        jPanel.add(answerLabel, constraints);

        /*constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.anchor = GridBagConstraints.EAST;
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.weightx = 0.25;
        constraints.weighty = 0.1;
        JLabel inputLabel = new JLabel("Введите название города:\n");
        inputLabel.setFont(new Font("Montserrat", Font.ITALIC, 20));
        jPanel.add(inputLabel, constraints);*/

        constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 0.1;
        inputField = new JTextField(20);
        inputField.setFont(new Font("Montserrat", Font.ITALIC, 20));
        jPanel.add(inputField, constraints);

        constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.weightx = 0.25;
        constraints.weighty = 0.1;
        inputButton = new JButton(new ImageIcon(enterURL));
        inputButton.setBorder(BorderFactory.createEmptyBorder());
        //inputButton.setFont(new Font("Montserrat", Font.ITALIC, 20));
        inputButton.addActionListener(Main::play);
        jPanel.add(inputButton, constraints);

        constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.weightx = 0.5;
        constraints.weighty = 0.1;
        JButton toLevels = new JButton(new ImageIcon(backURL));
        toLevels.addActionListener(Main::levelChoiceScene);
        toLevels.setBorder(BorderFactory.createEmptyBorder());
        jPanel.add(toLevels, constraints);

        constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.anchor = GridBagConstraints.EAST;
        constraints.gridx = 3;
        constraints.gridy = 3;
        constraints.weightx = 0.5;
        constraints.weighty = 0.1;
        JButton helper = new JButton(new ImageIcon(helpURL));
        helper.addActionListener(Main::getHelp);
        helper.setBorder(BorderFactory.createEmptyBorder());
        jPanel.add(helper, constraints);

        jPanel.updateUI();
    }

    private static void play(ActionEvent e)
    {

        city = inputField.getText();
        inputField.setText("");
        jPanel.updateUI();
        try
        {
            if (isUsed(city, used) == false && isCity(city, cities) && (lastChar == '\0' || lastChar == getFirstChar(city))) {
                used.add(city);
                textArea.append(city+"\n");
                //answerLabel.setText(city);
                lastChar = getLastChar(city);
                jPanel.updateUI();
            }
            /*else if (signal){
                { answerLabel.setText("Игра закончилась");
                    return;
                }
            }*/
            else {
                if (signal) {
                        answerLabel.setText("Игра закончилась");
                        return;
                    }
                else{
                        answerLabel.setText("Попробуйте еще раз :)");
                        return;
                    }

                }
        }
        catch (IOException ex) { System.out.println("Что-то пошло не так :("); }
        jPanel.updateUI();
        if (lastChar == 'Ё'){ lastChar = 'Е'; }
        address = "C://Users//Александра//IdeaProjects//sem2//src//ru//spbu//apmath//armchair_traveler//" + level
                + "//" + level + lastChar + ".txt";
        try
        {
            BufferedReader in2 = new BufferedReader(new FileReader(address));
            List<String> tmp = new ArrayList<>();
            String potCity = in2.readLine();
            while (potCity != null) {
                if (isUsed(potCity, used) == false) {
                    tmp.add(potCity);
                }
                potCity = in2.readLine();
            }
            int number = tmp.size();
            if (number == 0){
                answerLabel.setText("<html>Мне нечего сказать :(<br>Вы победили!</html>");
                answerLabel.setFont(new Font("Montserrat", Font.ITALIC, 40));
                signal = true;
            }
            /*if (answerLabel.getText() == "Мне нечего сказать :( Вы победили!"){
                gameWindow.dispose();
            }*/
            else {
                Random random = new Random();
                int index = random.nextInt(number);
                nextWord = tmp.get(index);
                answerLabel.setText(nextWord);
                used.add(nextWord);
                textArea.append(nextWord+"\n");
                lastChar = getLastChar(nextWord);
                if (lastChar == 'Ё'){ lastChar = 'Е'; }
                if (isTheEnd(nextWord, used, level)){
                    answerLabel.setText("<html>" + nextWord + "<br/>Ха-ха, вы проиграли</html>");
                    answerLabel.setFont(new Font("Montserrat", Font.ITALIC, 40));
                    signal = true;
                }
                /*if (answerLabel.getText() == "Ха-ха вы проиграли"){
                    gameWindow.dispose();
                }*/
            }
        }
        catch (IOException ex) { System.out.println("Не удалось найти города на эту букву :("); }

        jPanel.updateUI();
    }

    private static void getHelp(ActionEvent e)
    {
        if (used.isEmpty()){
            answerLabel.setText("Еще рано для подсказки ;)");
            answerLabel.setFont(new Font("Montserrat", Font.ITALIC, 30));
        }
        else if (signal){
            answerLabel.setText("Игра закончилась, подсказки не нужны");
            answerLabel.setFont(new Font("Montserrat", Font.ITALIC, 30));
        }
        else {
            lastChar = getLastChar(nextWord);
            if (lastChar == 'Ё') {
                lastChar = 'Е';
            }
            address = "C://Users//Александра//IdeaProjects//sem2//src//ru//spbu//apmath//armchair_traveler//" + level
                    + "//" + level + lastChar + ".txt";
            jPanel.updateUI();
            try {
                BufferedReader in2 = new BufferedReader(new FileReader(address));
                List<String> tmp = new ArrayList<>();
                String potCity = in2.readLine();
                while (potCity != null) {
                    if (isUsed(potCity, used) == false) {
                        tmp.add(potCity);
                    }
                    potCity = in2.readLine();
                }
                int number = tmp.size();
                Random random = new Random();
                int index = random.nextInt(number);
                helpfulWord = tmp.get(index);
                inputField.setText(helpfulWord);
            } catch (IOException ex) {
                System.out.println("Не удалось найти города на эту букву :(");
            }
        }
    }
}
