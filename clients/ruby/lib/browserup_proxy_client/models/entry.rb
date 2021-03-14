=begin
#BrowserUp Proxy

#___ This is the REST API for controlling the BrowserUp Proxy.  The BrowserUp Proxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.0.1

=end

require 'date'
require 'time'

module BrowserupProxy
  class Entry
    attr_accessor :pageref

    attr_accessor :started_date_time

    attr_accessor :time

    attr_accessor :request

    attr_accessor :response

    attr_accessor :cache

    attr_accessor :timings

    attr_accessor :server_ip_address

    attr_accessor :connection

    attr_accessor :comment

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'pageref' => :'pageref',
        :'started_date_time' => :'startedDateTime',
        :'time' => :'time',
        :'request' => :'request',
        :'response' => :'response',
        :'cache' => :'cache',
        :'timings' => :'timings',
        :'server_ip_address' => :'serverIPAddress',
        :'connection' => :'connection',
        :'comment' => :'comment'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'pageref' => :'String',
        :'started_date_time' => :'String',
        :'time' => :'Float',
        :'request' => :'EntryRequest',
        :'response' => :'EntryResponse',
        :'cache' => :'Object',
        :'timings' => :'Object',
        :'server_ip_address' => :'OneOfAnyTypeAnyType',
        :'connection' => :'String',
        :'comment' => :'String'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `BrowserupProxy::Entry` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `BrowserupProxy::Entry`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'pageref')
        self.pageref = attributes[:'pageref']
      end

      if attributes.key?(:'started_date_time')
        self.started_date_time = attributes[:'started_date_time']
      end

      if attributes.key?(:'time')
        self.time = attributes[:'time']
      end

      if attributes.key?(:'request')
        self.request = attributes[:'request']
      end

      if attributes.key?(:'response')
        self.response = attributes[:'response']
      end

      if attributes.key?(:'cache')
        self.cache = attributes[:'cache']
      end

      if attributes.key?(:'timings')
        self.timings = attributes[:'timings']
      end

      if attributes.key?(:'server_ip_address')
        self.server_ip_address = attributes[:'server_ip_address']
      end

      if attributes.key?(:'connection')
        self.connection = attributes[:'connection']
      end

      if attributes.key?(:'comment')
        self.comment = attributes[:'comment']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @started_date_time.nil?
        invalid_properties.push('invalid value for "started_date_time", started_date_time cannot be nil.')
      end

      if @time.nil?
        invalid_properties.push('invalid value for "time", time cannot be nil.')
      end

      if @time < 0
        invalid_properties.push('invalid value for "time", must be greater than or equal to 0.')
      end

      if @request.nil?
        invalid_properties.push('invalid value for "request", request cannot be nil.')
      end

      if @response.nil?
        invalid_properties.push('invalid value for "response", response cannot be nil.')
      end

      if @cache.nil?
        invalid_properties.push('invalid value for "cache", cache cannot be nil.')
      end

      if @timings.nil?
        invalid_properties.push('invalid value for "timings", timings cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @started_date_time.nil?
      return false if @time.nil?
      return false if @time < 0
      return false if @request.nil?
      return false if @response.nil?
      return false if @cache.nil?
      return false if @timings.nil?
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] time Value to be assigned
    def time=(time)
      if time.nil?
        fail ArgumentError, 'time cannot be nil'
      end

      if time < 0
        fail ArgumentError, 'invalid value for "time", must be greater than or equal to 0.'
      end

      @time = time
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          pageref == o.pageref &&
          started_date_time == o.started_date_time &&
          time == o.time &&
          request == o.request &&
          response == o.response &&
          cache == o.cache &&
          timings == o.timings &&
          server_ip_address == o.server_ip_address &&
          connection == o.connection &&
          comment == o.comment
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [pageref, started_date_time, time, request, response, cache, timings, server_ip_address, connection, comment].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = BrowserupProxy.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
