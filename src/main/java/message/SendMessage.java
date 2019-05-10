/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package message;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class SendMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SendMessage\",\"namespace\":\"message\",\"fields\":[{\"name\":\"from\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"to\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"subject\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"bodyText\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"attachmentContentType\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"attachmentFilename\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"attachmentContent\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
    private static final long serialVersionUID = -6743080521990054286L;
    private static final org.apache.avro.io.DatumWriter
            WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
    private static final org.apache.avro.io.DatumReader
            READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);
    @Deprecated
    public java.lang.String from;
    @Deprecated
    public java.lang.String to;
    @Deprecated
    public java.lang.String subject;
    @Deprecated
    public java.lang.String bodyText;
    @Deprecated
    public java.lang.String attachmentContentType;
    @Deprecated
    public java.lang.String attachmentFilename;
    @Deprecated
    public java.lang.String attachmentContent;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public SendMessage() {
    }

    /**
     * All-args constructor.
     * @param from The new value for from
     * @param to The new value for to
     * @param subject The new value for subject
     * @param bodyText The new value for bodyText
     * @param attachmentContentType The new value for attachmentContentType
     * @param attachmentFilename The new value for attachmentFilename
     * @param attachmentContent The new value for attachmentContent
     */
    public SendMessage(java.lang.String from, java.lang.String to, java.lang.String subject, java.lang.String bodyText, java.lang.String attachmentContentType, java.lang.String attachmentFilename, java.lang.String attachmentContent) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.bodyText = bodyText;
        this.attachmentContentType = attachmentContentType;
        this.attachmentFilename = attachmentFilename;
        this.attachmentContent = attachmentContent;
    }

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    /**
     * Creates a new SendMessage RecordBuilder.
     * @return A new SendMessage RecordBuilder
     */
    public static message.SendMessage.Builder newBuilder() {
        return new message.SendMessage.Builder();
    }

    /**
     * Creates a new SendMessage RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new SendMessage RecordBuilder
     */
    public static message.SendMessage.Builder newBuilder(message.SendMessage.Builder other) {
        return new message.SendMessage.Builder(other);
    }

    /**
     * Creates a new SendMessage RecordBuilder by copying an existing SendMessage instance.
     * @param other The existing instance to copy.
     * @return A new SendMessage RecordBuilder
     */
    public static message.SendMessage.Builder newBuilder(message.SendMessage other) {
        return new message.SendMessage.Builder(other);
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return from;
            case 1:
                return to;
            case 2:
                return subject;
            case 3:
                return bodyText;
            case 4:
                return attachmentContentType;
            case 5:
                return attachmentFilename;
            case 6:
                return attachmentContent;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                from = (java.lang.String) value$;
                break;
            case 1:
                to = (java.lang.String) value$;
                break;
            case 2:
                subject = (java.lang.String) value$;
                break;
            case 3:
                bodyText = (java.lang.String) value$;
                break;
            case 4:
                attachmentContentType = (java.lang.String) value$;
                break;
            case 5:
                attachmentFilename = (java.lang.String) value$;
                break;
            case 6:
                attachmentContent = (java.lang.String) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'from' field.
     * @return The value of the 'from' field.
     */
    public java.lang.String getFrom() {
        return from;
    }

    /**
     * Sets the value of the 'from' field.
     * @param value the value to set.
     */
    public void setFrom(java.lang.String value) {
        this.from = value;
    }

    /**
     * Gets the value of the 'to' field.
     * @return The value of the 'to' field.
     */
    public java.lang.String getTo() {
        return to;
    }

    /**
     * Sets the value of the 'to' field.
     * @param value the value to set.
     */
    public void setTo(java.lang.String value) {
        this.to = value;
    }

    /**
     * Gets the value of the 'subject' field.
     * @return The value of the 'subject' field.
     */
    public java.lang.String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the 'subject' field.
     * @param value the value to set.
     */
    public void setSubject(java.lang.String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the 'bodyText' field.
     * @return The value of the 'bodyText' field.
     */
    public java.lang.String getBodyText() {
        return bodyText;
    }

    /**
     * Sets the value of the 'bodyText' field.
     * @param value the value to set.
     */
    public void setBodyText(java.lang.String value) {
        this.bodyText = value;
    }

    /**
     * Gets the value of the 'attachmentContentType' field.
     * @return The value of the 'attachmentContentType' field.
     */
    public java.lang.String getAttachmentContentType() {
        return attachmentContentType;
    }

    /**
     * Sets the value of the 'attachmentContentType' field.
     * @param value the value to set.
     */
    public void setAttachmentContentType(java.lang.String value) {
        this.attachmentContentType = value;
    }

    /**
     * Gets the value of the 'attachmentFilename' field.
     * @return The value of the 'attachmentFilename' field.
     */
    public java.lang.String getAttachmentFilename() {
        return attachmentFilename;
    }

    /**
     * Sets the value of the 'attachmentFilename' field.
     * @param value the value to set.
     */
    public void setAttachmentFilename(java.lang.String value) {
        this.attachmentFilename = value;
    }

    /**
     * Gets the value of the 'attachmentContent' field.
     * @return The value of the 'attachmentContent' field.
     */
    public java.lang.String getAttachmentContent() {
        return attachmentContent;
    }

    /**
     * Sets the value of the 'attachmentContent' field.
     * @param value the value to set.
     */
    public void setAttachmentContent(java.lang.String value) {
        this.attachmentContent = value;
    }

    @Override
    public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @Override
    public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    /**
     * RecordBuilder for SendMessage instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SendMessage>
            implements org.apache.avro.data.RecordBuilder<SendMessage> {

        private java.lang.String from;
        private java.lang.String to;
        private java.lang.String subject;
        private java.lang.String bodyText;
        private java.lang.String attachmentContentType;
        private java.lang.String attachmentFilename;
        private java.lang.String attachmentContent;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(message.SendMessage.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.from)) {
                this.from = data().deepCopy(fields()[0].schema(), other.from);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.to)) {
                this.to = data().deepCopy(fields()[1].schema(), other.to);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.subject)) {
                this.subject = data().deepCopy(fields()[2].schema(), other.subject);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.bodyText)) {
                this.bodyText = data().deepCopy(fields()[3].schema(), other.bodyText);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.attachmentContentType)) {
                this.attachmentContentType = data().deepCopy(fields()[4].schema(), other.attachmentContentType);
                fieldSetFlags()[4] = true;
            }
            if (isValidValue(fields()[5], other.attachmentFilename)) {
                this.attachmentFilename = data().deepCopy(fields()[5].schema(), other.attachmentFilename);
                fieldSetFlags()[5] = true;
            }
            if (isValidValue(fields()[6], other.attachmentContent)) {
                this.attachmentContent = data().deepCopy(fields()[6].schema(), other.attachmentContent);
                fieldSetFlags()[6] = true;
            }
        }

        /**
         * Creates a Builder by copying an existing SendMessage instance
         * @param other The existing instance to copy.
         */
        private Builder(message.SendMessage other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.from)) {
                this.from = data().deepCopy(fields()[0].schema(), other.from);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.to)) {
                this.to = data().deepCopy(fields()[1].schema(), other.to);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.subject)) {
                this.subject = data().deepCopy(fields()[2].schema(), other.subject);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.bodyText)) {
                this.bodyText = data().deepCopy(fields()[3].schema(), other.bodyText);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.attachmentContentType)) {
                this.attachmentContentType = data().deepCopy(fields()[4].schema(), other.attachmentContentType);
                fieldSetFlags()[4] = true;
            }
            if (isValidValue(fields()[5], other.attachmentFilename)) {
                this.attachmentFilename = data().deepCopy(fields()[5].schema(), other.attachmentFilename);
                fieldSetFlags()[5] = true;
            }
            if (isValidValue(fields()[6], other.attachmentContent)) {
                this.attachmentContent = data().deepCopy(fields()[6].schema(), other.attachmentContent);
                fieldSetFlags()[6] = true;
            }
        }

        /**
         * Gets the value of the 'from' field.
         * @return The value.
         */
        public java.lang.String getFrom() {
            return from;
        }

        /**
         * Sets the value of the 'from' field.
         * @param value The value of 'from'.
         * @return This builder.
         */
        public message.SendMessage.Builder setFrom(java.lang.String value) {
            validate(fields()[0], value);
            this.from = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'from' field has been set.
         * @return True if the 'from' field has been set, false otherwise.
         */
        public boolean hasFrom() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'from' field.
         * @return This builder.
         */
        public message.SendMessage.Builder clearFrom() {
            from = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'to' field.
         * @return The value.
         */
        public java.lang.String getTo() {
            return to;
        }

        /**
         * Sets the value of the 'to' field.
         * @param value The value of 'to'.
         * @return This builder.
         */
        public message.SendMessage.Builder setTo(java.lang.String value) {
            validate(fields()[1], value);
            this.to = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'to' field has been set.
         * @return True if the 'to' field has been set, false otherwise.
         */
        public boolean hasTo() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'to' field.
         * @return This builder.
         */
        public message.SendMessage.Builder clearTo() {
            to = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'subject' field.
         * @return The value.
         */
        public java.lang.String getSubject() {
            return subject;
        }

        /**
         * Sets the value of the 'subject' field.
         * @param value The value of 'subject'.
         * @return This builder.
         */
        public message.SendMessage.Builder setSubject(java.lang.String value) {
            validate(fields()[2], value);
            this.subject = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'subject' field has been set.
         * @return True if the 'subject' field has been set, false otherwise.
         */
        public boolean hasSubject() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'subject' field.
         * @return This builder.
         */
        public message.SendMessage.Builder clearSubject() {
            subject = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'bodyText' field.
         * @return The value.
         */
        public java.lang.String getBodyText() {
            return bodyText;
        }

        /**
         * Sets the value of the 'bodyText' field.
         * @param value The value of 'bodyText'.
         * @return This builder.
         */
        public message.SendMessage.Builder setBodyText(java.lang.String value) {
            validate(fields()[3], value);
            this.bodyText = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'bodyText' field has been set.
         * @return True if the 'bodyText' field has been set, false otherwise.
         */
        public boolean hasBodyText() {
            return fieldSetFlags()[3];
        }


        /**
         * Clears the value of the 'bodyText' field.
         * @return This builder.
         */
        public message.SendMessage.Builder clearBodyText() {
            bodyText = null;
            fieldSetFlags()[3] = false;
            return this;
        }

        /**
         * Gets the value of the 'attachmentContentType' field.
         * @return The value.
         */
        public java.lang.String getAttachmentContentType() {
            return attachmentContentType;
        }

        /**
         * Sets the value of the 'attachmentContentType' field.
         * @param value The value of 'attachmentContentType'.
         * @return This builder.
         */
        public message.SendMessage.Builder setAttachmentContentType(java.lang.String value) {
            validate(fields()[4], value);
            this.attachmentContentType = value;
            fieldSetFlags()[4] = true;
            return this;
        }

        /**
         * Checks whether the 'attachmentContentType' field has been set.
         * @return True if the 'attachmentContentType' field has been set, false otherwise.
         */
        public boolean hasAttachmentContentType() {
            return fieldSetFlags()[4];
        }


        /**
         * Clears the value of the 'attachmentContentType' field.
         * @return This builder.
         */
        public message.SendMessage.Builder clearAttachmentContentType() {
            attachmentContentType = null;
            fieldSetFlags()[4] = false;
            return this;
        }

        /**
         * Gets the value of the 'attachmentFilename' field.
         * @return The value.
         */
        public java.lang.String getAttachmentFilename() {
            return attachmentFilename;
        }

        /**
         * Sets the value of the 'attachmentFilename' field.
         * @param value The value of 'attachmentFilename'.
         * @return This builder.
         */
        public message.SendMessage.Builder setAttachmentFilename(java.lang.String value) {
            validate(fields()[5], value);
            this.attachmentFilename = value;
            fieldSetFlags()[5] = true;
            return this;
        }

        /**
         * Checks whether the 'attachmentFilename' field has been set.
         * @return True if the 'attachmentFilename' field has been set, false otherwise.
         */
        public boolean hasAttachmentFilename() {
            return fieldSetFlags()[5];
        }


        /**
         * Clears the value of the 'attachmentFilename' field.
         * @return This builder.
         */
        public message.SendMessage.Builder clearAttachmentFilename() {
            attachmentFilename = null;
            fieldSetFlags()[5] = false;
            return this;
        }

        /**
         * Gets the value of the 'attachmentContent' field.
         * @return The value.
         */
        public java.lang.String getAttachmentContent() {
            return attachmentContent;
        }

        /**
         * Sets the value of the 'attachmentContent' field.
         * @param value The value of 'attachmentContent'.
         * @return This builder.
         */
        public message.SendMessage.Builder setAttachmentContent(java.lang.String value) {
            validate(fields()[6], value);
            this.attachmentContent = value;
            fieldSetFlags()[6] = true;
            return this;
        }

        /**
         * Checks whether the 'attachmentContent' field has been set.
         * @return True if the 'attachmentContent' field has been set, false otherwise.
         */
        public boolean hasAttachmentContent() {
            return fieldSetFlags()[6];
        }


        /**
         * Clears the value of the 'attachmentContent' field.
         * @return This builder.
         */
        public message.SendMessage.Builder clearAttachmentContent() {
            attachmentContent = null;
            fieldSetFlags()[6] = false;
            return this;
        }

        @Override
        public SendMessage build() {
            try {
                SendMessage record = new SendMessage();
                record.from = fieldSetFlags()[0] ? this.from : (java.lang.String) defaultValue(fields()[0]);
                record.to = fieldSetFlags()[1] ? this.to : (java.lang.String) defaultValue(fields()[1]);
                record.subject = fieldSetFlags()[2] ? this.subject : (java.lang.String) defaultValue(fields()[2]);
                record.bodyText = fieldSetFlags()[3] ? this.bodyText : (java.lang.String) defaultValue(fields()[3]);
                record.attachmentContentType = fieldSetFlags()[4] ? this.attachmentContentType : (java.lang.String) defaultValue(fields()[4]);
                record.attachmentFilename = fieldSetFlags()[5] ? this.attachmentFilename : (java.lang.String) defaultValue(fields()[5]);
                record.attachmentContent = fieldSetFlags()[6] ? this.attachmentContent : (java.lang.String) defaultValue(fields()[6]);
                return record;
            } catch (Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

}
