import unittest
from os import access


class TestBankaccount(unittest.TestCase):
    def test_negative_newbalance(self):
        self.assertRaises(ValueError,Bankaccount,'111',-111)
    def test_positive_newbalance(self):
        account1 = Bankaccount("121",121)
        self.assertEqual(121,account1.getBalance())
    def test_succesful_deposit(self):
        account2 = Bankaccount("2222",100)
        account2.deposit(50)
        self.assertEqual(account2.getBalance(),150)
    def test_unsuccesful_deposit(self):
        account3 = Bankaccount("3333",0)
        with self.assertRaises(ValueError) as context:
            account3.deposit(-1)
            self.assertEqual(str(context.exception),"haven't money")
    def test_correct_withdraw(self):
        account4 = Bankaccount("4444",15)
        account4.withdraw(5)
        self.assertEqual(account4.getBalance(),10)
    def test_uncorerct_withdraw_pos(self):
        account5 = Bankaccount("5555",0)
        with self.assertRaises(ValueError) as context:
            account5.withdraw(5)
            self.assertEqual(str(context.exception),"haven't money")
    def test_uncorrect_withdraw_min(self):
        account6 = Bankaccount("667",20)
        with self.assertRaises(ValueError) as context:
            account6.withdraw(-5)
            self.assertEqual(str(context.exception),"negative values")
    def test_get_Balance(self):
        account7 = Bankaccount("777",60)
        self.assertEqual(account7.getBalance(),60)
    def test_balance_overral(self):
        account8 = Bankaccount("8888",70)
        account8.deposit(10)
        self.assertEqual(account8.getBalance(),80)

class Bankaccount:
    def __init__(self,accountNumber: str, balance: float = 0.0):
        if balance < 0:
            raise ValueError ("!!!!")
        self.accountNumber = accountNumber
        self.balance = balance
    def deposit(self,amount:float):
        if amount <=0:
            raise ValueError("АЙ АЙ АЙ ")
        self.balance +=amount
    def withdraw(self,amount: float):
        if amount<=0:
            raise ValueError("Iffff")
        if amount > self.balance:
            raise ValueError ("Insufficient funds")
        self.balance -=amount
    def getBalance(self):
        return self.balance

if __name__ == "__111__":
    unittest.main()
