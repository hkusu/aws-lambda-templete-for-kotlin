package io.github.hkusu.githubrepositoryreport

import com.amazonaws.services.lambda.runtime.ClientContext
import com.amazonaws.services.lambda.runtime.CognitoIdentity
import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.LambdaLogger

fun main(args: Array<String>) {
    val main = Handler()

    // ローカルで実行する場合は
    //   export HOGE_TOKEN="your token"
    // で環境変数を設定しておく(AWS Lambda として動かす場合は管理コンソールで設定)

    println(main.handleRequest(Input("hoge"), DummyContest()))

    // exitProcess(0) // コルーチン等を利用してプロセスが終了しない場合
}

class DummyContest: Context {
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
