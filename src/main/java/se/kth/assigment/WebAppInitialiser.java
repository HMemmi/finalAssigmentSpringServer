package se.kth.assigment;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitialiser implements WebApplicationInitializer {

	/**
	 * This method is to create the {@link DispatcherServlet}
	 */
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		WebApplicationContext context=getContext();
		servletContext.addListener(new ContextLoaderListener(context));
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
		 dispatcher.setLoadOnStartup(1);
	     dispatcher.addMapping("/*");

	}

	/**
	 * This method tells spring where to find the servlet config which is WebConfig class
	 * @return
	 */
	private AnnotationConfigWebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext anno=new AnnotationConfigWebApplicationContext();
		anno.setConfigLocation("se.kth.assigment.WebConfig");
		anno.register(se.kth.assigment.WebConfig.class);
		return anno;
	}

}
