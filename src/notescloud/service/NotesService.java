package notescloud.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import notescloud.business.NotesManager;
import notescloud.model.NotesModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "notes")
public class NotesService extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
Date date = new Date();
        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat dateformat = new SimpleDateFormat("Ymd Hms");


        String json = "{\"id\":1,\"title\":\"My Notes\",\"text\":\"Notes text\",\"timecreated\":32434343,\"timemodified\":null,\"length\":435}";
        NotesModel notesmodel = mapper.readValue(json, NotesModel.class);
        out.print(mapper.writeValueAsString(NotesManager.getNotes(1)) + dateformat.format(date));
//        out.print("<html><body><h1>Hello</h1></body></html>");
    }
}
