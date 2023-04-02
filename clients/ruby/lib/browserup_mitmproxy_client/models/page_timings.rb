=begin
#BrowserUp MitmProxy

#___ This is the REST API for controlling the BrowserUp MitmProxy. The BrowserUp MitmProxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.4.0

=end

require 'date'
require 'time'

module BrowserupMitmProxy
  class PageTimings
    attr_accessor :on_content_load

    attr_accessor :on_load

    attr_accessor :_href

    attr_accessor :_dns

    attr_accessor :_ssl

    attr_accessor :_time_to_first_byte

    attr_accessor :_cumulative_layout_shift

    attr_accessor :_largest_contentful_paint

    attr_accessor :_first_paint

    attr_accessor :_first_input_delay

    attr_accessor :_dom_interactive

    attr_accessor :_first_contentful_paint

    attr_accessor :comment

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'on_content_load' => :'onContentLoad',
        :'on_load' => :'onLoad',
        :'_href' => :'_href',
        :'_dns' => :'_dns',
        :'_ssl' => :'_ssl',
        :'_time_to_first_byte' => :'_timeToFirstByte',
        :'_cumulative_layout_shift' => :'_cumulativeLayoutShift',
        :'_largest_contentful_paint' => :'_largestContentfulPaint',
        :'_first_paint' => :'_firstPaint',
        :'_first_input_delay' => :'_firstInputDelay',
        :'_dom_interactive' => :'_domInteractive',
        :'_first_contentful_paint' => :'_firstContentfulPaint',
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
        :'on_content_load' => :'Integer',
        :'on_load' => :'Integer',
        :'_href' => :'String',
        :'_dns' => :'Integer',
        :'_ssl' => :'Integer',
        :'_time_to_first_byte' => :'Integer',
        :'_cumulative_layout_shift' => :'Float',
        :'_largest_contentful_paint' => :'LargestContentfulPaint',
        :'_first_paint' => :'Integer',
        :'_first_input_delay' => :'Float',
        :'_dom_interactive' => :'Integer',
        :'_first_contentful_paint' => :'Integer',
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
        fail ArgumentError, "The input argument (attributes) must be a hash in `BrowserupMitmProxy::PageTimings` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `BrowserupMitmProxy::PageTimings`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'on_content_load')
        self.on_content_load = attributes[:'on_content_load']
      else
        self.on_content_load = -1
      end

      if attributes.key?(:'on_load')
        self.on_load = attributes[:'on_load']
      else
        self.on_load = -1
      end

      if attributes.key?(:'_href')
        self._href = attributes[:'_href']
      else
        self._href = ''
      end

      if attributes.key?(:'_dns')
        self._dns = attributes[:'_dns']
      else
        self._dns = -1
      end

      if attributes.key?(:'_ssl')
        self._ssl = attributes[:'_ssl']
      else
        self._ssl = -1
      end

      if attributes.key?(:'_time_to_first_byte')
        self._time_to_first_byte = attributes[:'_time_to_first_byte']
      else
        self._time_to_first_byte = -1
      end

      if attributes.key?(:'_cumulative_layout_shift')
        self._cumulative_layout_shift = attributes[:'_cumulative_layout_shift']
      else
        self._cumulative_layout_shift = -1
      end

      if attributes.key?(:'_largest_contentful_paint')
        self._largest_contentful_paint = attributes[:'_largest_contentful_paint']
      end

      if attributes.key?(:'_first_paint')
        self._first_paint = attributes[:'_first_paint']
      else
        self._first_paint = -1
      end

      if attributes.key?(:'_first_input_delay')
        self._first_input_delay = attributes[:'_first_input_delay']
      else
        self._first_input_delay = -1
      end

      if attributes.key?(:'_dom_interactive')
        self._dom_interactive = attributes[:'_dom_interactive']
      else
        self._dom_interactive = -1
      end

      if attributes.key?(:'_first_contentful_paint')
        self._first_contentful_paint = attributes[:'_first_contentful_paint']
      else
        self._first_contentful_paint = -1
      end

      if attributes.key?(:'comment')
        self.comment = attributes[:'comment']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @on_content_load.nil?
        invalid_properties.push('invalid value for "on_content_load", on_content_load cannot be nil.')
      end

      if @on_content_load < -1
        invalid_properties.push('invalid value for "on_content_load", must be greater than or equal to -1.')
      end

      if @on_load.nil?
        invalid_properties.push('invalid value for "on_load", on_load cannot be nil.')
      end

      if @on_load < -1
        invalid_properties.push('invalid value for "on_load", must be greater than or equal to -1.')
      end

      if !@_dns.nil? && @_dns < -1
        invalid_properties.push('invalid value for "_dns", must be greater than or equal to -1.')
      end

      if !@_ssl.nil? && @_ssl < -1
        invalid_properties.push('invalid value for "_ssl", must be greater than or equal to -1.')
      end

      if !@_time_to_first_byte.nil? && @_time_to_first_byte < -1
        invalid_properties.push('invalid value for "_time_to_first_byte", must be greater than or equal to -1.')
      end

      if !@_cumulative_layout_shift.nil? && @_cumulative_layout_shift < -1
        invalid_properties.push('invalid value for "_cumulative_layout_shift", must be greater than or equal to -1.')
      end

      if !@_first_paint.nil? && @_first_paint < -1
        invalid_properties.push('invalid value for "_first_paint", must be greater than or equal to -1.')
      end

      if !@_first_input_delay.nil? && @_first_input_delay < -1
        invalid_properties.push('invalid value for "_first_input_delay", must be greater than or equal to -1.')
      end

      if !@_dom_interactive.nil? && @_dom_interactive < -1
        invalid_properties.push('invalid value for "_dom_interactive", must be greater than or equal to -1.')
      end

      if !@_first_contentful_paint.nil? && @_first_contentful_paint < -1
        invalid_properties.push('invalid value for "_first_contentful_paint", must be greater than or equal to -1.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @on_content_load.nil?
      return false if @on_content_load < -1
      return false if @on_load.nil?
      return false if @on_load < -1
      return false if !@_dns.nil? && @_dns < -1
      return false if !@_ssl.nil? && @_ssl < -1
      return false if !@_time_to_first_byte.nil? && @_time_to_first_byte < -1
      return false if !@_cumulative_layout_shift.nil? && @_cumulative_layout_shift < -1
      return false if !@_first_paint.nil? && @_first_paint < -1
      return false if !@_first_input_delay.nil? && @_first_input_delay < -1
      return false if !@_dom_interactive.nil? && @_dom_interactive < -1
      return false if !@_first_contentful_paint.nil? && @_first_contentful_paint < -1
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] on_content_load Value to be assigned
    def on_content_load=(on_content_load)
      if on_content_load.nil?
        fail ArgumentError, 'on_content_load cannot be nil'
      end

      if on_content_load < -1
        fail ArgumentError, 'invalid value for "on_content_load", must be greater than or equal to -1.'
      end

      @on_content_load = on_content_load
    end

    # Custom attribute writer method with validation
    # @param [Object] on_load Value to be assigned
    def on_load=(on_load)
      if on_load.nil?
        fail ArgumentError, 'on_load cannot be nil'
      end

      if on_load < -1
        fail ArgumentError, 'invalid value for "on_load", must be greater than or equal to -1.'
      end

      @on_load = on_load
    end

    # Custom attribute writer method with validation
    # @param [Object] _dns Value to be assigned
    def _dns=(_dns)
      if !_dns.nil? && _dns < -1
        fail ArgumentError, 'invalid value for "_dns", must be greater than or equal to -1.'
      end

      @_dns = _dns
    end

    # Custom attribute writer method with validation
    # @param [Object] _ssl Value to be assigned
    def _ssl=(_ssl)
      if !_ssl.nil? && _ssl < -1
        fail ArgumentError, 'invalid value for "_ssl", must be greater than or equal to -1.'
      end

      @_ssl = _ssl
    end

    # Custom attribute writer method with validation
    # @param [Object] _time_to_first_byte Value to be assigned
    def _time_to_first_byte=(_time_to_first_byte)
      if !_time_to_first_byte.nil? && _time_to_first_byte < -1
        fail ArgumentError, 'invalid value for "_time_to_first_byte", must be greater than or equal to -1.'
      end

      @_time_to_first_byte = _time_to_first_byte
    end

    # Custom attribute writer method with validation
    # @param [Object] _cumulative_layout_shift Value to be assigned
    def _cumulative_layout_shift=(_cumulative_layout_shift)
      if !_cumulative_layout_shift.nil? && _cumulative_layout_shift < -1
        fail ArgumentError, 'invalid value for "_cumulative_layout_shift", must be greater than or equal to -1.'
      end

      @_cumulative_layout_shift = _cumulative_layout_shift
    end

    # Custom attribute writer method with validation
    # @param [Object] _first_paint Value to be assigned
    def _first_paint=(_first_paint)
      if !_first_paint.nil? && _first_paint < -1
        fail ArgumentError, 'invalid value for "_first_paint", must be greater than or equal to -1.'
      end

      @_first_paint = _first_paint
    end

    # Custom attribute writer method with validation
    # @param [Object] _first_input_delay Value to be assigned
    def _first_input_delay=(_first_input_delay)
      if !_first_input_delay.nil? && _first_input_delay < -1
        fail ArgumentError, 'invalid value for "_first_input_delay", must be greater than or equal to -1.'
      end

      @_first_input_delay = _first_input_delay
    end

    # Custom attribute writer method with validation
    # @param [Object] _dom_interactive Value to be assigned
    def _dom_interactive=(_dom_interactive)
      if !_dom_interactive.nil? && _dom_interactive < -1
        fail ArgumentError, 'invalid value for "_dom_interactive", must be greater than or equal to -1.'
      end

      @_dom_interactive = _dom_interactive
    end

    # Custom attribute writer method with validation
    # @param [Object] _first_contentful_paint Value to be assigned
    def _first_contentful_paint=(_first_contentful_paint)
      if !_first_contentful_paint.nil? && _first_contentful_paint < -1
        fail ArgumentError, 'invalid value for "_first_contentful_paint", must be greater than or equal to -1.'
      end

      @_first_contentful_paint = _first_contentful_paint
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          on_content_load == o.on_content_load &&
          on_load == o.on_load &&
          _href == o._href &&
          _dns == o._dns &&
          _ssl == o._ssl &&
          _time_to_first_byte == o._time_to_first_byte &&
          _cumulative_layout_shift == o._cumulative_layout_shift &&
          _largest_contentful_paint == o._largest_contentful_paint &&
          _first_paint == o._first_paint &&
          _first_input_delay == o._first_input_delay &&
          _dom_interactive == o._dom_interactive &&
          _first_contentful_paint == o._first_contentful_paint &&
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
      [on_content_load, on_load, _href, _dns, _ssl, _time_to_first_byte, _cumulative_layout_shift, _largest_contentful_paint, _first_paint, _first_input_delay, _dom_interactive, _first_contentful_paint, comment].hash
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
      attributes = attributes.transform_keys(&:to_sym)
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
        klass = BrowserupMitmProxy.const_get(type)
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
