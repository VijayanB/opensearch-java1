/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
import co.elastic.clients.elasticsearch.indices.AliasDefinition;
import co.elastic.clients.elasticsearch.indices.IndexSettings;
import co.elastic.clients.elasticsearch.indices.IndexState;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.put_component_template.Request
public final class PutComponentTemplateRequest extends RequestBase implements ToJsonp {
	private final String name;

	@Nullable
	private final Boolean create;

	@Nullable
	private final JsonValue masterTimeout;

	private final IndexState template;

	@Nullable
	private final Map<String, AliasDefinition> aliases;

	@Nullable
	private final TypeMapping mappings;

	@Nullable
	private final IndexSettings settings;

	@Nullable
	private final Number version;

	@Nullable
	private final Map<String, JsonValue> _meta;

	// ---------------------------------------------------------------------------------------------

	protected PutComponentTemplateRequest(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.create = builder.create;
		this.masterTimeout = builder.masterTimeout;
		this.template = Objects.requireNonNull(builder.template, "template");
		this.aliases = builder.aliases;
		this.mappings = builder.mappings;
		this.settings = builder.settings;
		this.version = builder.version;
		this._meta = builder._meta;

	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code create}
	 */
	@Nullable
	public Boolean create() {
		return this.create;
	}

	/**
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * API name: {@code template}
	 */
	public IndexState template() {
		return this.template;
	}

	/**
	 * API name: {@code aliases}
	 */
	@Nullable
	public Map<String, AliasDefinition> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code mappings}
	 */
	@Nullable
	public TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * API name: {@code settings}
	 */
	@Nullable
	public IndexSettings settings() {
		return this.settings;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code _meta}
	 */
	@Nullable
	public Map<String, JsonValue> _meta() {
		return this._meta;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("template");
		this.template.toJsonp(generator, mapper);

		if (this.aliases != null) {

			generator.writeKey("aliases");
			generator.writeStartObject();
			for (Map.Entry<String, AliasDefinition> item0 : this.aliases.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.mappings != null) {

			generator.writeKey("mappings");
			this.mappings.toJsonp(generator, mapper);

		}
		if (this.settings != null) {

			generator.writeKey("settings");
			this.settings.toJsonp(generator, mapper);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version.doubleValue());

		}
		if (this._meta != null) {

			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this._meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutComponentTemplateRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutComponentTemplateRequest> {
		private String name;

		@Nullable
		private Boolean create;

		@Nullable
		private JsonValue masterTimeout;

		private IndexState template;

		@Nullable
		private Map<String, AliasDefinition> aliases;

		@Nullable
		private TypeMapping mappings;

		@Nullable
		private IndexSettings settings;

		@Nullable
		private Number version;

		@Nullable
		private Map<String, JsonValue> _meta;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code create}
		 */
		public Builder create(@Nullable Boolean value) {
			this.create = value;
			return this;
		}

		/**
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable JsonValue value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public Builder template(IndexState value) {
			this.template = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public Builder template(Function<IndexState.Builder, ObjectBuilder<IndexState>> fn) {
			return this.template(fn.apply(new IndexState.Builder()).build());
		}

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(@Nullable Map<String, AliasDefinition> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aliases(Map)}, creating the map if needed.
		 */
		public Builder putAliases(String key, AliasDefinition value) {
			if (this.aliases == null) {
				this.aliases = new HashMap<>();
			}
			this.aliases.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aliases(Map)} to a singleton map.
		 */
		public Builder aliases(String key, Function<AliasDefinition.Builder, ObjectBuilder<AliasDefinition>> fn) {
			return this.aliases(Collections.singletonMap(key, fn.apply(new AliasDefinition.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aliases(Map)}, creating the map if needed.
		 */
		public Builder putAliases(String key, Function<AliasDefinition.Builder, ObjectBuilder<AliasDefinition>> fn) {
			return this.putAliases(key, fn.apply(new AliasDefinition.Builder()).build());
		}

		/**
		 * API name: {@code mappings}
		 */
		public Builder mappings(@Nullable TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * API name: {@code mappings}
		 */
		public Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(@Nullable IndexSettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.settings(fn.apply(new IndexSettings.Builder()).build());
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code _meta}
		 */
		public Builder _meta(@Nullable Map<String, JsonValue> value) {
			this._meta = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #_meta(Map)}, creating the map if needed.
		 */
		public Builder put_meta(String key, JsonValue value) {
			if (this._meta == null) {
				this._meta = new HashMap<>();
			}
			this._meta.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link PutComponentTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutComponentTemplateRequest build() {

			return new PutComponentTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for PutComponentTemplateRequest
	 */
	public static final JsonpValueParser<PutComponentTemplateRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, PutComponentTemplateRequest::setupPutComponentTemplateRequestParser);

	protected static void setupPutComponentTemplateRequestParser(
			DelegatingJsonpValueParser<PutComponentTemplateRequest.Builder> op) {

		op.add(Builder::template, IndexState.JSONP_PARSER, "template");
		op.add(Builder::aliases, JsonpValueParser.stringMapParser(AliasDefinition.JSONP_PARSER), "aliases");
		op.add(Builder::mappings, TypeMapping.JSONP_PARSER, "mappings");
		op.add(Builder::settings, IndexSettings.JSONP_PARSER, "settings");
		op.add(Builder::version, JsonpValueParser.numberParser(), "version");
		op.add(Builder::_meta, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()), "_meta");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.put_component_template}".
	 */
	public static final Endpoint<PutComponentTemplateRequest, PutComponentTemplateResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "POST",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_component_template");
				buf.append("/");
				buf.append(request.name);
				return buf.toString();

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.create != null) {
					params.put("create", String.valueOf(request.create));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, PutComponentTemplateResponse.JSONP_PARSER);
}