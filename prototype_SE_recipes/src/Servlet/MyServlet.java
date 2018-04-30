package Servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

import Classes.Document;
import Classes.Path;
import Classes.Recipe;
import IndexingLucene.MyIndexReader;
import SearchLucene.QueryRetrievalModel;
import com.google.gson.Gson;
import main.DetailMain;
import main.QueryMain;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.json.JSONArray;
import java.io.PrintWriter;
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String query =request.getParameter("query");
            Path.IndexRECIPEDir=this.getServletContext().getRealPath("/data/indexRecipe/");
            Path.StopwordDir=this.getServletContext().getRealPath("/data/stopword.txt");
            Path.CleanData=this.getServletContext().getRealPath("/data/result.txt");
            Path.Recipecsv=this.getServletContext().getRealPath("/data/RRR.csv");

            DetailMain q = new DetailMain();
            List<Recipe> results =(ArrayList<Recipe>) q.shows(query);

            request.setAttribute("titles", results);

            RequestDispatcher rd = request.getRequestDispatcher("/show_detail.jsp");
            rd.include(request, response);
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        try {
            processRequest(request, response);
        }

        catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}/*package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import Classes.Document;
import IndexingLucene.MyIndexReader;
import SearchLucene.QueryRetrievalModel;
import com.google.gson.Gson;
import org.json.JSONArray;
import java.io.PrintWriter;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

try{
    String temp=request.getParameter("keyword");
    HashMap <String, Object> map = new HashMap<>();
    map.put("1", "1");
    map.put("2", "2");
    String json = new Gson().toJson(map);
    //去掉两边的[]符号
    //json=json.substring(1,json.length()-1);
    System.out.println(json);
    //以流的方式将json文本输出到DateGrid组件中
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter pw=response.getWriter();
    pw.write(json);
    pw.flush();
    pw.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print ("error");
            throw new RuntimeException(e);
        }


    }
}*/
