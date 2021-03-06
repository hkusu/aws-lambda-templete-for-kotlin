package io.github.hkusu.githubrepositoryreport

import com.amazonaws.services.lambda.runtime.ClientContext
import com.amazonaws.services.lambda.runtime.CognitoIdentity
import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.LambdaLogger

fun main(args: Array<String>) {
    val handler = Handler()

    // 環境変数を利用する場合は
    //   export HOGE_TOKEN="your token"
    // で予め設定しておく(AWS Lambda として動かす場合は管理コンソールで設定)

    println(handler.handleRequest(Input("hoge"), DummyContext()))

    // exitProcess(0) // コルーチン等を利用してプロセスが終了しない場合
}

class DummyContext: Context {
    override fun getAwsRequestId(): String {
        TODO("not implemented")
    }

    override fun getLogStreamName(): String {
        TODO("not implemented")
    }

    override fun getClientContext(): ClientContext {
        TODO("not implemented")
    }

    override fun getFunctionName(): String {
        TODO("not implemented")
    }

    override fun getRemainingTimeInMillis(): Int {
        TODO("not implemented")
    }

    override fun getLogger(): LambdaLogger {
        TODO("not implemented")
    }

    override fun getInvokedFunctionArn(): String {
        TODO("not implemented")
    }

    override fun getMemoryLimitInMB(): Int {
        TODO("not implemented")
    }

    override fun getLogGroupName(): String {
        TODO("not implemented")
    }

    override fun getFunctionVersion(): String {
        TODO("not implemented")
    }

    override fun getIdentity(): CognitoIdentity {
        TODO("not implemented")
    }
}
