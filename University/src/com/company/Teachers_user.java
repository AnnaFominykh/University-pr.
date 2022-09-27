package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Teachers_user {
    ArrayList<Chat> chats =new ArrayList<>();

    Iterator<Chat> chat = chats.iterator();

    public Integer idU()
    {
        int idU;
        for (idU = 0; idU <30 ; idU++);


        return null;
    }

    public void mess (Student stud, int mid,String text) {
        Integer IDu=idU();
        Chat new_mess = new Chat();
        new_mess.setMess_id(mid);
        new_mess.setMess_text(text);
        stud.setStudent_id(idU());
        boolean add = chats.add(new_mess);
    }

}
