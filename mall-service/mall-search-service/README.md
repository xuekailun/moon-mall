# winows 安装es

    https://blog.csdn.net/weixin_39370907/article/details/99974710
# ES中FieldType讲解

    @Field(type=FieldType.Text, analyzer="ik_max_word")     表示该字段是一个文本，并作最大程度拆分，默认建立索引
    
    @Field(type=FieldType.Text,index=false)             表示该字段是一个文本，不建立索引
    
    @Field(type=FieldType.Date)                                表示该字段是一个文本，日期类型，默认不建立索引
    
    @Field(type=FieldType.Long)                               表示该字段是一个长整型，默认建立索引
    
    @Field(type=FieldType.Keyword)                         表示该字段内容是一个文本并作为一个整体不可分，默认建立索引
    
    @Field(type=FieldType.Float)                               表示该字段内容是一个浮点类型并作为一个整体不可分，默认建立索引
    
     
    
    date 、float、long都是不能够被拆分的