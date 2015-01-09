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

package com.liferay.kickstart.remote.services.service.impl;

import com.liferay.kickstart.remote.services.service.base.UserNotificationRemoteServiceBaseImpl;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * The implementation of the user notification remote remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.kickstart.remote.services.service.UserNotificationRemoteService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author riccardoferrari
 * @see com.liferay.kickstart.remote.services.service.base.UserNotificationRemoteServiceBaseImpl
 * @see com.liferay.kickstart.remote.services.service.UserNotificationRemoteServiceUtil
 */
public class UserNotificationRemoteServiceImpl
	extends UserNotificationRemoteServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.kickstart.remote.services.service.UserNotificationRemoteServiceUtil} to access the user notification remote remote service.
	 */
	public void updateNotification(long gorupId) {
		_log.info("Permission checking");
		_log.info("Performing local service call");
	}

	Log _log = LogFactoryUtil.getLog(getClass());
}