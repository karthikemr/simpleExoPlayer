package sample.app.simplehlsexo;

import android.net.Uri;
import android.support.annotation.Nullable;

import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;

import java.io.IOException;

public final class IgnitorHlsDataSourceFactory implements HlsDataSourceFactory {


    private final DataSource.Factory factory;

    public IgnitorHlsDataSourceFactory(DataSource.Factory factory) {
        this.factory = factory;
    }

    @Override
    public DataSource createDataSource(int dataType) {
        DataSource dataSource = factory.createDataSource();
        return dataSource;
    }


}
