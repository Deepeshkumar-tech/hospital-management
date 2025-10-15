package com.demo.example.student_library_management_system.Converters;

import com.demo.example.student_library_management_system.Model.Book;
import com.demo.example.student_library_management_system.Model.Card;
import com.demo.example.student_library_management_system.Requestdto.BookRequestDto;
import com.demo.example.student_library_management_system.Requestdto.CardRequestDto;

public class CardConverter
{


    public static Card CardRequestDtoToCard(CardRequestDto cardRequestDto)
    {
         Card card=new Card();

              card.setCardStatus(cardRequestDto.getCardStatus());

              return card;



    }

}
