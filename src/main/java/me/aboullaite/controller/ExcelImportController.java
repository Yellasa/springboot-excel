package me.aboullaite.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import cn.afterturn.easypoi.handler.inter.IExcelDataHandler;
import me.aboullaite.controller.handler.ExcelHandler;
import me.aboullaite.model.ForceStandardDetailExcelDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class ExcelImportController {

	private static final Logger log = LoggerFactory.getLogger(ExcelImportController.class);

	@PostMapping("excelImport")
	public void excelImport(@RequestParam("file") MultipartFile file) {
		ImportParams importParams = new ImportParams();
		// 数据处理
		IExcelDataHandler<ForceStandardDetailExcelDto> handler = new ExcelHandler();
		importParams.setDataHandler(handler);

		// 需要验证
		importParams.setNeedVerfiy(true);
        importParams.setHeadRows(2);

		try {
			ExcelImportResult<ForceStandardDetailExcelDto> result = ExcelImportUtil.importExcelMore(file.getInputStream(), ForceStandardDetailExcelDto.class,
					importParams);

			List<ForceStandardDetailExcelDto> successList = result.getList();
			//List<ForceStandardDetailExcelDto> failList = result.getFailList();

			log.info("是否存在验证未通过的数据:" + result.isVerfiyFail());
			log.info("验证通过的数量:" + successList.size());
			//log.info("验证未通过的数量:" + failList.size());

			for (ForceStandardDetailExcelDto user : successList) {
				log.info("成功列表信息:ID=" + user.getPowerFactor());
			}
			//for (ForceStandardDetailExcelDto user : failList) {
			//	log.info("失败列表信息:" + user);
			//}
		} catch (IOException e) {
			log.error(e.getMessage(), e);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

}