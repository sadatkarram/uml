package org.example.realization.implementts;

public class PdfReportGenerator implements ReportGenerator{

    @Override
    public void generataReport() {
        System.out.println("Generating PDF report");
    }
}


/*
ReportGenerator ◁⋯⋯⋯ PDFReportGenerator

Dashed line = realization (implements)
Hollow triangle = points to the interface or abstract class
* */