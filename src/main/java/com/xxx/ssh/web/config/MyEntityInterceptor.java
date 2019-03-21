package com.xxx.ssh.web.config;
import java.io.Serializable;
import java.util.Date;
import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
public class MyEntityInterceptor extends EmptyInterceptor {

	private static final long serialVersionUID = 1L;
	private static final String CREATE_DATE="createDate";
	private static final String MODIFY_DATE="modifyDate";
	
	@Override
	public boolean onFlushDirty(Object entity, Serializable id,
			Object[] currentState, Object[] previousState,
			String[] propertyNames, Type[] types) {
		for(int i=0;i<propertyNames.length;i++){
			if(MODIFY_DATE.equals(propertyNames[i])){		
				currentState[i] = new Date();
			}
		}
		return true;
	}

	@Override
	public boolean onSave(Object entity, Serializable id, Object[] state,
			String[] propertyNames, Type[] types) {
		for(int i=0;i<propertyNames.length;i++){
			if(CREATE_DATE.equals(propertyNames[i]) || MODIFY_DATE.equals(propertyNames[i])){		
				state[i] = new Date();
			}
		}
		return true;
	}

}
