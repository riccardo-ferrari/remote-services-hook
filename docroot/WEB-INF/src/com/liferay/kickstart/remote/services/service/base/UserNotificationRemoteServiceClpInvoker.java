/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.kickstart.remote.services.service.base;

import com.liferay.kickstart.remote.services.service.UserNotificationRemoteServiceUtil;

import java.util.Arrays;

/**
 * @author riccardoferrari
 * @generated
 */
public class UserNotificationRemoteServiceClpInvoker {
	public UserNotificationRemoteServiceClpInvoker() {
		_methodName14 = "getBeanIdentifier";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "setBeanIdentifier";

		_methodParameterTypes15 = new String[] { "java.lang.String" };

		_methodName18 = "updateNotification";

		_methodParameterTypes18 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return UserNotificationRemoteServiceUtil.getBeanIdentifier();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			UserNotificationRemoteServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			UserNotificationRemoteServiceUtil.updateNotification(((Long)arguments[0]).longValue());

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName18;
	private String[] _methodParameterTypes18;
}