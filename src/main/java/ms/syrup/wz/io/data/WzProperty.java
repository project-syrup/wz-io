package ms.syrup.wz.io.data;

import ms.syrup.wz.io.WzFile;

import java.io.IOException;

public class WzProperty extends WzAbstractExtendedData {

    public WzProperty(final String label) {
        super(WzDataType.PROPERTY, label);
    }

    @Override
    protected WzProperty read(final WzFile reader) throws IOException {
        reader.readShort();
        this.parseChildren(reader);
        return this;
    }
}
