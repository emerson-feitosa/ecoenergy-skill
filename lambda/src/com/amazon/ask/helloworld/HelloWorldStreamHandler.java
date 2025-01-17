/*
     Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
     Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
     except in compliance with the License. A copy of the License is located at
         http://aws.amazon.com/apache2.0/
     or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
     the specific language governing permissions and limitations under the License.
*/

package com.amazon.ask.helloworld;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.helloworld.handlers.AskForAllMonthlyConsumptionsIntentHandler;
import com.amazon.ask.helloworld.handlers.AskForDevicesIntentHandler;
import com.amazon.ask.helloworld.handlers.AskForTipsIntentHandler;
import com.amazon.ask.helloworld.handlers.AskForUserIntentHandler;
import com.amazon.ask.helloworld.handlers.CancelandStopIntentHandler;
import com.amazon.ask.helloworld.handlers.CreateDeviceIntentHandler;
import com.amazon.ask.helloworld.handlers.CreateMonthlyConsumptionIntentHandler;
import com.amazon.ask.helloworld.handlers.CreateUserIntentHandler;
import com.amazon.ask.helloworld.handlers.DeleteUserIntentHandler;
import com.amazon.ask.helloworld.handlers.HelloWorldIntentHandler;
import com.amazon.ask.helloworld.handlers.HelpIntentHandler;
import com.amazon.ask.helloworld.handlers.SessionEndedRequestHandler;
import com.amazon.ask.helloworld.handlers.LaunchRequestHandler;
import com.amazon.ask.helloworld.handlers.FallbackIntentHandler;

public class HelloWorldStreamHandler extends SkillStreamHandler {

	private static Skill getSkill() {
		return Skills.standard()
				.addRequestHandlers(
						new CancelandStopIntentHandler(),
						new HelloWorldIntentHandler(),
						new AskForTipsIntentHandler(),
						new AskForDevicesIntentHandler(),
						new AskForUserIntentHandler(),
						new DeleteUserIntentHandler(),
						new CreateUserIntentHandler(),
						new CreateMonthlyConsumptionIntentHandler(),
						new CreateDeviceIntentHandler(),
						new AskForAllMonthlyConsumptionsIntentHandler(),
						new HelpIntentHandler(),
						new LaunchRequestHandler(),
						new SessionEndedRequestHandler(),
						new FallbackIntentHandler())
				// Add your skill id below
				// .withSkillId("")
				.build();
	}

	public HelloWorldStreamHandler() {
		super(getSkill());
	}

}
