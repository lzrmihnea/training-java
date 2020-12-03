package ro.training.java.c10.filereader.apachepoi;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ExcelReader {
    public static final String SAMPLE_XLSX_FILE_PATH = "./sample-xlsx-file.xlsx";
    public static final String SAMPLE_XLSX_FILE_PATH2 = "C:\\work\\docs\\book1.xlsx";

    public static void main(String[] args) {

        try (Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH2))) {


            // Retrieving the number of sheets in the Workbook
            System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");

            Sheet firstSheet = workbook.getSheetAt(0);

            Iterator<Row> rowIt = firstSheet.rowIterator();
            while (rowIt.hasNext()) {
                System.out.println("\n new row! \n");
                Row currentRow = rowIt.next();

//                currentRow.getCell(0); // Column A
//                currentRow.getCell(1); // Column B
//                currentRow.getCell(4); // Column E

                Iterator<Cell> cellIt = currentRow.cellIterator();

                while (cellIt.hasNext()) {
                    Cell next = cellIt.next();

                    switch (next.getCellTypeEnum()) {
                        case STRING:
                            System.out.print(next.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(next.getNumericCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(next.getBooleanCellValue() + "\t");
                            break;
                        default:
                            System.out.println("cell was another value type \t");
                    }

                }
            }

        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


