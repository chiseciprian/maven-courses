package ro.itschool.mvnbase.curs15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CountryWritter {
    private final String path;
    private BufferedWriter fileWritter;
    private boolean opened;


    public CountryWritter(String path) throws IOException {
        this.path = path;
        this.fileWritter = new BufferedWriter(new FileWriter(path));
        this.opened = true;
    }


    public void writter(List<Country> countries) throws IOException {
        for (Country country : countries) {
            writter(country, false);
        }
        fileWritter.flush();
    }

    public void writter(Country country) throws IOException {
        writter(country, true);
    }

    private void writter(Country country, boolean doFlash) throws IOException {
        if (!opened) {
            fileWritter = openWithAppend();
        }
        fileWritter.write("The country of " + country.getName() + " has capital in " + country.getCapital() + " with a population of " + country.getPopulation() + " on an area of " + country.getArea());
        fileWritter.newLine();
        if (doFlash) {
            fileWritter.flush();
        }
    }

    private void writterHtml(Country country) throws IOException {
        fileWritter.write(
                "<tr>" +
                "<td>"+country.getName()+"</td>" +
                "<td>"+country.getCapital()+"</td>" +
                "<td>"+country.getPopulation()+"</td>" +
                "<td>"+country.getArea()+"</td>" +
                "<td>"+country.getRegion()+"</td>" +
                "<td>"+country.getBorders()+"</td>" +
                "<td>"+country.getLanguages().get(0).getName()+"</td>" +
                "</tr>"
                );
        fileWritter.flush();
    }

    public void writterHtml(List<Country>countries) throws IOException {
       fileWritter.write("<html>" +
               "<head>" +
               "<style>" +
               "table {\n" +
               "  font-family: arial, sans-serif;\n" +
               "  border-collapse: collapse;\n" +
               "  width: 100%;\n" +
               "}\n" +
               "\n" +
               "td, th {\n" +
               "  border: 1px solid #dddddd;\n" +
               "  text-align: left;\n" +
               "  padding: 8px;\n" +
               "}\n" +
               "\n" +
               "tr:nth-child(even) {\n" +
               "  background-color: #dddddd;\n" +
               "}\n" +
               "</style>\n" +
               "</head>\n" +
               "<body>" +"<table>" +
               "<tr>" +
               "<th>Country</th>" +
               "<th>Capital</th>" +
               "<th>Population</th>" +
               "<th>Area</th>" +
               "<th>Region</th>" +
               "<th>Borders</th>" +
               "<th>Languages</th>" +
               "</tr>");
        for (Country country:countries){
            writterHtml(country);
        }
        fileWritter.write("</table></body>");
    }

    private BufferedWriter openWithAppend() throws IOException {
        return new BufferedWriter(new FileWriter(path, true));
    }
}
