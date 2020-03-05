package com.his.pdf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.his.model.HisAtenciones;

@Service("excel")
public class ExcelServiceImpl implements ExcelService{

	@Override
	public ByteArrayInputStream exportAllData(List<HisAtenciones> atenciones) {
		// TODO Auto-generated method stub
		String [] columns= {"id","nombre"};
		Workbook workbook =new HSSFWorkbook();
		ByteArrayOutputStream stream =new ByteArrayOutputStream();
		
		Sheet sheet =workbook.createSheet("Atenciones");
		
		Row row=sheet.createRow(0);
		
		for(int i=0;i<columns.length;i++) {
			Cell cell =row.createCell(i);
			cell.setCellValue(columns[i]);
			
		}
		int initRow =1;
		for(HisAtenciones i: atenciones) {
			row=sheet.createRow(initRow);
			row.createCell(0).setCellValue(i.getAnio());
			row.createCell(1).setCellValue(i.getAnio());
			initRow++;
		}
		try {
			workbook.write(stream);
			workbook.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return new ByteArrayInputStream(stream.toByteArray());
	}

	
}
