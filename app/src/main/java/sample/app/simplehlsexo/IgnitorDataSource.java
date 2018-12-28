package sample.app.simplehlsexo;

import android.net.Uri;
import android.support.annotation.Nullable;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;

import java.io.IOException;

public class IgnitorDataSource implements DataSource {

    private final DataSource dataSource;

    public IgnitorDataSource(DataSource ds) {
        this.dataSource = ds;
    }

    @Override
    public long open(DataSpec dataSpec) throws IOException {
        return dataSource.open(dataSpec);
    }

    @Override
    public int read(byte[] buffer, int offset, int readLength) throws IOException {
        return dataSource.read(buffer, offset, readLength);
    }

    @Nullable
    @Override
    public Uri getUri() {
        return dataSource.getUri();
    }

    @Override
    public void close() throws IOException {
        dataSource.close();
    }
}