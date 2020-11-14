class User(Account):

    def __init__(self, id, name, document, email, password):
        super(User, self).__init__(self, id, name, document, email, password)