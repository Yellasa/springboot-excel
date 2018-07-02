package me.aboullaite;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootExcelViewApplicationTests {

	@Test
	public void contextLoads() {
	}

	//@Test
	//public void test2() {
	//	ImportParams params = new ImportParams();
	//	params.setTitleRows(1);
	//	params.setHeadRows(1);
	//	long start = new Date().getTime();
	//	List<ForceStandardDetailExcelDto> list = ExcelImportUtil.importExcel(
	//			new File(PoiPublicUtil.getWebRootPath("import/ExcelExportMsgClient.xlsx")),
	//			ForceStandardDetailExcelDto.class, params);
	//	System.out.println(new Date().getTime() - start);
	//	System.out.println(list.size());
	//	System.out.println(ReflectionToStringBuilder.toString(list.get(0)));
	//}

}
