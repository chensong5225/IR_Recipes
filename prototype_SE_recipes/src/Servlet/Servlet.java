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
 @WebServlet("/Servlet")
 public class Servlet extends HttpServlet {

     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException, Exception {
         response.setContentType("text/html;charset=UTF-8");
         try (PrintWriter out = response.getWriter()) {
             String query = request.getParameter("query");
             if (query == "" || query == null) {
                 RequestDispatcher rd = request.getRequestDispatcher("/Search.html");
                 rd.include(request, response);
             } else {
                 Path.IndexRECIPEDir = this.getServletContext().getRealPath("/data/indexRecipe/");
                 Path.StopwordDir = this.getServletContext().getRealPath("/data/stopword.txt");
                 Path.CleanData = this.getServletContext().getRealPath("/data/result.txt");
                 Path.Recipecsv = this.getServletContext().getRealPath("/data/RRR.csv");

                 DetailMain q = new DetailMain();
                 List<Recipe> results = (ArrayList<Recipe>) q.shows(query);
                 List<String> result = new ArrayList<>();
                 for (Recipe r : results) {
                     result.add(r.getTitle());
                     System.out.println(r.getTitle());
                 }

                 request.setAttribute("titles", results);
                 request.setAttribute("title", result);
                 RequestDispatcher rd = request.getRequestDispatcher("/side_search.jsp");
                 rd.include(request, response);
             }
         }
     }
      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          try (PrintWriter out = response.getWriter()) {
              String query =request.getParameter("query");
              Path.IndexRECIPEDir=this.getServletContext().getRealPath("/data/indexRecipe/");
              Path.StopwordDir=this.getServletContext().getRealPath("/data/stopword.txt");
              Path.CleanData=this.getServletContext().getRealPath("/data/result.txt");
              Path.Recipecsv=this.getServletContext().getRealPath("/data/RRR.csv");

              QueryMain qu = new QueryMain();
             List<String> result =  qu.show(query);

              request.setAttribute("title", result);


              RequestDispatcher rd = request.getRequestDispatcher("/side_search.jsp");
              rd.include(request, response);
          } catch (Exception e) {
              e.printStackTrace();
          }
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
 }
