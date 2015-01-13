package org.wso2.carbon.inbound.endpoint.test;
/*
*  Copyright (c) $today.year, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.core.SynapseEnvironment;
import org.wso2.carbon.inbound.endpoint.protocol.generic.GenericPollingConsumer;

import java.util.Properties;

public class GenericConsumer extends GenericPollingConsumer{



	private static final Log log = LogFactory.getLog(GenericConsumer.class);

	public GenericConsumer(Properties properties, String name, SynapseEnvironment synapseEnvironment,
	                        long scanInterval, String injectingSeq, String onErrorSeq,
	                         boolean coordination, boolean sequential) {
		super(properties, name, synapseEnvironment, scanInterval, injectingSeq,
		      onErrorSeq, coordination, sequential);

	}


	@Override
	public Object poll() {
		Object o = "WSO2 Generic Inbound Test";
		log.info("Generic Polling Consumer Invoked");
		injectMessage("Hello ESB","text/plain");
		return o;
	}


}
