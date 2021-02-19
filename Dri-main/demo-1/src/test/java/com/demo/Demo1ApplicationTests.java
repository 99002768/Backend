package com.demo;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.demo.controller.DricalcController;
import com.demo.dao.DricalcRepository;
import com.demo.model.Dricalc1;
import com.demo.service.DricalService;



@SpringBootTest
class Demo1ApplicationTests {

	@Autowired
	DricalcController dricontroller;

	@Autowired
	DricalService driservice;
	 
	@MockBean
	DricalcRepository dridao;
		
	Dricalc1 improperConfigurationObject = new Dricalc1();

		@Test
		void createTest(){
			improperConfigurationObject.setWhatsNewID(40010);
			improperConfigurationObject.setDcNUM(1);
			improperConfigurationObject.setWhatsNewDescription("dricalc");	
			improperConfigurationObject.setVisibleToRep(0);
			improperConfigurationObject.setVisibleToOEM(1);
			improperConfigurationObject.setVisibleToDriSalesAndEmp(0);
			improperConfigurationObject.setOthers(0);
			improperConfigurationObject.setMoreInformation("http://www.dristeem.com/RenderPrivateFile/742567");
			improperConfigurationObject.setCreatedDate(null);
			improperConfigurationObject.setCreatedByID(954);
			improperConfigurationObject.setModifiedDate(null);
			improperConfigurationObject.setModifiedByID(954);
			
			System.out.println(dricontroller.post(improperConfigurationObject));
			String str=dricontroller.post(improperConfigurationObject);
			String b="posted successfully";
//			assertTrue(str.equals(b));
			assertEquals(str,b);
		}
		
		@Test
		 public void readAllDetails() {
			 List<Dricalc1> emp=driservice.getdetails();
			 assertThat(emp).size().isGreaterThan(-1);
		 }
		
		
		 @Test
		 public void updateTest(){
			 Dricalc1 emp=new Dricalc1(
					 62,	20,	"NEW FEATURE - Psychrometric Chart A Psychrometric chart is now available in DriCalc under the tools tab in the banner across the top of each page.",
					 	1,	1	,1	,1	,"http://www.dristeem.com/RenderPublicFile/781563",	null,	954,	null,	954);
			 when(dridao.save(emp)).thenReturn(emp);
			 assertEquals(emp, driservice.change(emp));
		 }
		
		 
		@Test
		void DeleteTest() {
		String str=dricontroller.delete(40010);
		String b="Successfully deleted";
//		 assertTrue(str.equals(b));
		assertEquals(str,b);
	}
		

		 @Test
		 public void CreateTest() {
			 Dricalc1 emp=new Dricalc1(
					 62,	20,	"NEW FEATURE - Psychrometric Chart A Psychrometric chart is now available in DriCalc under the tools tab in the banner across the top of each page.",
					 	1,	1	,1	,1	,"http://www.dristeem.com/RenderPublicFile/781563",	null,	954,	null,	954);
			 when(dridao.save(emp)).thenReturn(emp);
			 assertEquals(emp, driservice.change(emp));
		 }
		 
			@Test
			 public void readDetails() {
				 List<Dricalc1> emp=dricontroller.details();
				 assertThat(emp).size().isGreaterThan(-1);
			 }
		 
			 @Test
			 public void updateTesting(){
				 Dricalc1 emp=new Dricalc1(
						 62,	20,	"NEW FEATURE - Psychrometric Chart A Psychrometric chart is now available in DriCalc under the tools tab in the banner across the top of each page.",
						 	1,	1	,1	,1	,"http://www.dristeem.com/RenderPublicFile/781563",	null,	954,	null,	954);
				 when(dridao.save(emp)).thenReturn(emp);
				 assertEquals(emp, dricontroller.modify(emp));
			 }
		 

		 

}
