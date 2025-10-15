package com.demo.example.student_library_management_system.Converters;

import com.demo.example.student_library_management_system.Model.Student;
import com.demo.example.student_library_management_system.Model.Transaction;
import com.demo.example.student_library_management_system.Requestdto.StudentRequestDto;
import com.demo.example.student_library_management_system.Requestdto.TransactionRequestDto;

public class TransactionConvertor {

    public static Transaction TransactionRequestDtoToTransaction(TransactionRequestDto transactionRequestDto)
    {
        Transaction transaction = new Transaction();

          transaction.setTransactionDate(transactionRequestDto.getTransactionDate());
          transaction.setTransactionStatus(transactionRequestDto.getTransactionStatus());
          transaction.setDueDate(transactionRequestDto.getDueDate());
          transaction.setFine(transactionRequestDto.getFine());
          transaction.setIssueOrReturn(transactionRequestDto.getIssueOrReturn());

         return transaction;

    }


}
