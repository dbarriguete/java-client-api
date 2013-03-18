/*
 * Copyright 2012-2013 MarkLogic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.marklogic.client.test.example.handle;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.marklogic.client.example.handle.URIHandleExample;

public class URIHandleTest {
	@Test
	public void testMain() {
		boolean succeeded = false;
		try {
			URIHandleExample.main(new String[0]);
			succeeded = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertTrue("URIHandleExample failed", succeeded);
	}
}
