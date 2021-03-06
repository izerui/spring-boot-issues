/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.aop.monitor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class SuccessServiceMonitor {

	@Around("execution(* sample..*Service.*(..))")
	public Object logAop1(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Completed aop1: " + joinPoint);
		return joinPoint.proceed();
	}

	@Around("execution(@sample.aop.monitor.Aop * *(..))")
	public Object logAop2(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Completed aop2: " + joinPoint);
		return joinPoint.proceed();
	}


}
