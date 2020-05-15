package io.github.hkusu.githubrepositoryreport

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

class Handler : RequestHandler<Input, Output>  {

    override fun handleRequest(input: Input, context: Context): Output {

        // do something ...

        return Output(statusCode = 200, body = input.hoge ?: "")
    }
}

data class Input(
    var hoge: String? = null // varかつデフォルト値の指定が必要
)

// API Gateway の Lambda プロキシ統合の場合のreturn
data class Output(
    val statusCode: Int,
    val body: String
)
