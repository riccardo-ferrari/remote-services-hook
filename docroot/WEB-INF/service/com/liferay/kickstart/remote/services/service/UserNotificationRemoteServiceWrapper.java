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

package com.liferay.kickstart.remote.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserNotificationRemoteService}.
 *
 * @author riccardoferrari
 * @see UserNotificationRemoteService
 * @generated
 */
public class UserNotificationRemoteServiceWrapper
	implements UserNotificationRemoteService,
		ServiceWrapper<UserNotificationRemoteService> {
	public UserNotificationRemoteServiceWrapper(
		UserNotificationRemoteService userNotificationRemoteService) {
		_userNotificationRemoteService = userNotificationRemoteService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _userNotificationRemoteService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_userNotificationRemoteService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _userNotificationRemoteService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public void updateNotification(long gorupId) {
		_userNotificationRemoteService.updateNotification(gorupId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UserNotificationRemoteService getWrappedUserNotificationRemoteService() {
		return _userNotificationRemoteService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUserNotificationRemoteService(
		UserNotificationRemoteService userNotificationRemoteService) {
		_userNotificationRemoteService = userNotificationRemoteService;
	}

	@Override
	public UserNotificationRemoteService getWrappedService() {
		return _userNotificationRemoteService;
	}

	@Override
	public void setWrappedService(
		UserNotificationRemoteService userNotificationRemoteService) {
		_userNotificationRemoteService = userNotificationRemoteService;
	}

	private UserNotificationRemoteService _userNotificationRemoteService;
}