package com.generation.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import org.junit.Test;

public class TestLocalDate 
{
    //TEST GOOD DATA
    //decoratore/annotazione, modifica il comportamento del metodo su cui viene messo
    @Test
    public void testValidParsing()
    {
        //Si decide un input e l'output che il metodo deve fornire per tale input
        //si esegue il metodo
        //si verifica che l'output REALE sia uguale a quello ASPETTATO
        String in = "1995-08-27";
       
        int yearOutput = 1995;
        int monthOutput = 8;
        int dayOutput = 27;

        LocalDate converted = LocalDate.parse(in);
        //prende due parametri, se sono uguali il test va avanti, se sono diversi fallisce
        //UN TEST PASSA se arriva alla fine senza mai fallire                 
        //assertEquals( valoreAtteso           ,              valoreOttenuto);

        assertEquals(yearOutput,converted.getYear());
        assertEquals(monthOutput,converted.getMonthValue());
        assertEquals(dayOutput,converted.getDayOfMonth());
    }


    //TEST per BAD DATA
    @Test
    public void testInvalidParsing()
    {
        //voglio passare un input non sensato e VERIFICARE che il metodo dia eccezione
        String in = "paperino";


        try 
        {
            LocalDate converted = LocalDate.parse(in);  
            //se il programma arriva a questa riga invece sono TRISTE, perchè non ha prodotto eccezione
            //quando avrebbe dovuto
            fail("Ci aspettavamo un'eccezione, invece non l'abbiamo avuta");  
        } 
        catch (DateTimeParseException e) 
        {
            //se il programma finisce nel catch sono CONTENTO, e va tutto bene
        }
    }

    @Test
    public void testParsing()
    {
        //GOOD DATA
        String in1 = "1995-08-27";
       
        int yearOutput = 1995;
        int monthOutput = 8;
        int dayOutput = 27;
        LocalDate converted1 = LocalDate.parse(in1);
        assertEquals(yearOutput,converted1.getYear());
        assertEquals(monthOutput,converted1.getMonthValue());
        assertEquals(dayOutput,converted1.getDayOfMonth());


        //FORMATO NON VALIDO
        String in2 = "paperino";

        try 
        {
            LocalDate converted2 = LocalDate.parse(in2);  
            fail("Ci aspettavamo un'eccezione, invece non l'abbiamo avuta");  
        } 
        catch (DateTimeParseException e) 
        {
        }

         //FORMATO VALIDO ma valori sbagliati
         String in3 = "1995-45-45";

         try 
         {
             LocalDate converted3 = LocalDate.parse(in3);  
             fail("Ci aspettavamo un'eccezione, invece non l'abbiamo avuta");  
         } 
         catch (DateTimeParseException e) 
         {
         }


        //good data limite
        String in4 = "2024-02-29";
       
        int yearOutput2 = 2024;
        int monthOutput2 = 2;
        int dayOutput2 = 29;
        LocalDate converted4 = LocalDate.parse(in4);
        assertEquals(yearOutput2,converted4.getYear());
        assertEquals(monthOutput2,converted4.getMonthValue());
        assertEquals(dayOutput2,converted4.getDayOfMonth());

        //bad data limite
        String in5 = "2023-02-29";
        try 
        {
            LocalDate converted5 = LocalDate.parse(in5);  
            fail("Ci aspettavamo un'eccezione, invece non l'abbiamo avuta");  
        } 
        catch (DateTimeParseException e) 
        {
        }

    }
}

