package com.geese.plugin.excel.filter.read;

import com.geese.plugin.excel.filter.ReadFilter;
import com.geese.plugin.excel.filter.SheetFilter;
import com.geese.plugin.excel.mapping.SheetMapping;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * <p> 读取sheet之前过滤 <br>
 *
 * @author zhangguangyong <a href="#">1243610991@qq.com</a>
 * @date 2016/11/21 22:15
 * @sine 0.0.2
 */
public interface SheetBeforeReadFilter extends SheetFilter<Sheet, SheetMapping>, ReadFilter<Sheet, SheetMapping> {
}
