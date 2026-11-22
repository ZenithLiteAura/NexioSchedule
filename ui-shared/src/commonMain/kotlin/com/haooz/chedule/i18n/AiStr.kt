package com.haooz.chedule.i18n

/** 「AI 功能」页：自带服务商设置与功能入口（免费额度已移除）。 */
object AiStr {

    val providerNote = L(
        "AI 功能需要你自己的模型服务商；API key 只保存在本机",
        "AI features require your own model provider; the API key stays on this device.",
    )

    val byokSection = L("模型服务商", "Model Provider")
    val providerLabel = L("服务商", "Provider")
    val providerCustom = L("自定义", "Custom")
    val byokBaseUrl = L("接口地址", "Base URL")
    val byokBaseUrlHint = L("https://…/v1", "https://…/v1")
    val byokModel = L("模型名", "Model")
    val byokModelHint = L("模型 ID", "Model ID")
    val modelCustom = L("自定义模型", "Custom model")
    val byokApiKey = L("API key", "API key")
    val byokApiKeyHint = L("sk-...", "sk-...")
    val byokPrivacy = L(
        "API key 只保存在本机，不会上传到服务器",
        "Your API key stays on this device and is never uploaded.",
    )
    val testConnection = L("测试", "Test")
    val testIdle = L("尚未测试", "Not tested yet")
    val testingConnection = L("测试中…", "Testing…")
    val testConnectionOk = L("连接正常，耗时 %d ms", "Connected in %d ms")
    val testConnectionFailed = L("连接失败：%s", "Connection failed: %s")

    val features = L("功能入口", "Features")
    val entryShrink = L("通知精简缩略语", "Shorten notification labels")
    val entryShrinkSummary = L("AI 自动压缩课程名与上课地点", "Let AI shorten course names and locations")
    val entryEduImport = L("AI 教务导入", "AI academic import")
    val entryEduImportSummary = L(
        "自动读取教务系统并生成导入脚本",
        "Read the academic system and generate an import script",
    )
    val entryTextImport = L("AI 文本导入", "AI text import")
    val entryTextImportSummary = L(
        "用提示词把课表文本整理成导入格式",
        "Turn schedule text into the import format with a prompt",
    )
}
