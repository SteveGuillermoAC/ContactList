package ec.edu.tecnologico.contactos.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

import ec.edu.tecnologico.contactos.R;
import ec.edu.tecnologico.contactos.model.Contact;

public class AdapterContacts extends ArrayAdapter<Contact>{
    private Context context;
    private ArrayList<Contact> contactsItems;

    public AdapterContacts (Context context, ArrayList<Contact> contactsItems){
        super(context, R.layout.activity_item_list);
        this.context = context;
        this.contactsItems = contactsItems;
    }

    public int getCount(){

        return contactsItems.size();
    }

}

