package com.geese.plugin.excel.filter;

import com.geese.plugin.excel.mapping.SheetMapping;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * <p> sheet 过滤器 <br>
 *
 * @author zhangguangyong <a href="#">1243610991@qq.com</a>
 * @date 2016/11/21 22:06
 * @sine 0.0.2
 */
public interface SheetFilter<T extends Sheet, M extends SheetMapping> extends Filter<T, M> {
}
