package com.iwe.avengers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.iwe.avenger.dynamodb.entity.Avenger;
import com.iwe.avenger.lambda.response.HandlerResponse;

public class RemoveAvengerHandler implements RequestHandler<Avenger, HandlerResponse> {

	@Override
	public HandlerResponse handleRequest(final Avenger avenger, final Context context) {

		return null;
	}
}
