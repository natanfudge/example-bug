package example_bug

import kotlinx.serialization.Serializable

@Serializable
public data class TestSerializable(val x : Int)

@Serializable
internal data class Works(val nested: TestSerializable)