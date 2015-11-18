#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * DemoBaseController.java 2015年11月17日
 */
package ${package}.admin.demo.controller;

import org.macula.core.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * <b>DemoBaseController</b> Demo应用的URL基础地址
 * </p>
 *
 * @since 2015年11月17日
 * @author Rain
 * @version ${symbol_dollar}Id: DemoBaseController.java 5956 2015-11-17 03:48:27Z wzp ${symbol_dollar}
 */

@RequestMapping("/admin/demo")
public abstract class DemoBaseController extends BaseController {

}
