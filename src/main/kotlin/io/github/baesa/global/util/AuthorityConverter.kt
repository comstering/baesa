package io.github.baesa.global.util

import io.github.baesa.global.domain.Authority
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter
class AuthorityConverter: AttributeConverter<Authority, Int> {
    override fun convertToDatabaseColumn(attribute: Authority): Int {
        return attribute.index
    }

    override fun convertToEntityAttribute(dbData: Int): Authority {
        return Authority.values()[dbData]
    }
}
