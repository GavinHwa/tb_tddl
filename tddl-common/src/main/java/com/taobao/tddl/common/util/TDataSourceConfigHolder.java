/*(C) 2007-2012 Alibaba Group Holding Limited.	

import org.springframework.context.ApplicationContext;


public class TDataSourceConfigHolder {
	private static ThreadLocal<ApplicationContext> applicationContextThreadLocal = new ThreadLocal<ApplicationContext>();

	public static ApplicationContext getApplicationContext() {
		return applicationContextThreadLocal.get();
	}

	public static void setApplicationContext(
			ApplicationContext applicationCOntext) {
		applicationContextThreadLocal.set(applicationCOntext);
	}


}