package com.test.datepicker.view_data_picker

import android.content.Context
import android.util.AttributeSet

/**
 * Created by Administrator on 2019\5\20 0020.
 */
class MonthPicker : WheelPicker<Int> {


    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)



}