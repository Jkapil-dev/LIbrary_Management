package service;

import model.Transaction;
import repository.MemoryDatabase;

public class TransactionService {
    MemoryDatabase database;
    Transaction transaction = new Transaction();
}