package me.aboullaite.controller.handler;

import cn.afterturn.easypoi.handler.impl.ExcelDataHandlerDefaultImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcelHandler<T> extends ExcelDataHandlerDefaultImpl<T>
{
	
	private static final Logger log = LoggerFactory.getLogger(ExcelHandler.class);

	
	@Override
	public Object importHandler(T obj, String name, Object value) {
		log.info(name+":"+value);
		return super.importHandler(obj, name, value);
	}

}