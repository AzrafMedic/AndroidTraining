package jp.mixi.sample.res.string;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView formatView = (TextView) findViewById(R.id.FormatText);
		TextView arrayView = (TextView) findViewById(R.id.ArrayText);
		TextView pluralsView = (TextView) findViewById(R.id.PluralsText);

		// �t�H�[�}�b�g�ɖ��ߍ���ŕ�����𐮌`����
		// �t�H�[�}�b�g�͉ϒ������Ŏw�肷��̂ŁA�����ł����ߍ��ނ��Ƃ��\
		formatView.setText(getString(R.string.format_string, "Hoge", "driving"));

		// ������̔z������o���āA0�Ԗڂ̕������\������
		arrayView.setText(getResources().getStringArray(R.array.array_strings)[0]);

		// �����`�̕\����\������
		pluralsView.setText(getResources().getQuantityString(R.plurals.plurals_string, 0, 0));
	}
}