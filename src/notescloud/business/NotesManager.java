package notescloud.business;

import notescloud.model.NotesModel;

import java.math.BigInteger;

public class NotesManager {
    public static NotesModel getNotes(int notesid){
        NotesModel notes = new NotesModel();
        notes.setId(1);
        notes.setLength(435);
        notes.setTimecreated(BigInteger.valueOf(32434343));
        notes.setTitle("My Notes");
        notes.setText("Notes text");
        return notes;
    }

    public int addNotes(NotesModel notes){
        return 1;
    }
}
