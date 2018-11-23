class Narc1:
    condition = ''
    K = int()

    def set_dose(self):
        self.condition = 'N'

    def transfer(self):
        self.condition = 'p'

    def wait(self):
        self.condition = '.'


class Narc2:
    condition = '.'
    K = int()

    def wait(self):
        self.condition = '.'

    def inject(self):
        self.condition = 'I'
