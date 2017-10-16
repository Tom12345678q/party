package cn.edu.hist.party.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;

import cn.edu.hist.party.util.SysConfig;


/**
 * Application Lifecycle Listener implementation class StartListener
 *
 */

public class StartListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public StartListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	String rootPath = arg0.getServletContext().getContextPath()+"/";
    	arg0.getServletContext().setAttribute("rootPath",rootPath);
    	
    	String backPath = rootPath+"backstage/";
    	arg0.getServletContext().setAttribute("backPath", backPath);
    	
    	String frontPath = rootPath+"front/";
    	arg0.getServletContext().setAttribute("frontPath", frontPath);
    	
    	String staticPath = rootPath+"static/";
    	arg0.getServletContext().setAttribute("staticPath", staticPath);
    	
    	String jqueryPath = String.format("<script type=\"text/javascript\" src=\"%s\"></script>",rootPath + "static/js/jquery-3.1.1.min.js" );
    	arg0.getServletContext().setAttribute("jqueryPath",jqueryPath);
    	
    	String bootstrapCss = String.format("<link rel=\"stylesheet\" href=\"%s\">", rootPath + "static/css/bootstrap.min.css");
    	arg0.getServletContext().setAttribute("bootstrapCss", bootstrapCss);
    	
    	SysConfig.ROOT_PATH = rootPath;
    	
    	arg0.getServletContext().setAttribute("filePath", rootPath+"file/");
    	SysConfig.FILE_PATH=rootPath+"file/";
    	
    	Logger logger = Logger.getLogger(this.getClass());
    	logger.info("rootPath:"+rootPath);
    	logger.info("jquery:"+jqueryPath);
    	logger.info("bootstrapCss:"+bootstrapCss);
    }
	
}
