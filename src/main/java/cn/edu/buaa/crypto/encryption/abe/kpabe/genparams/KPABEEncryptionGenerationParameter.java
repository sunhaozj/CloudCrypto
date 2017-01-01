package cn.edu.buaa.crypto.encryption.abe.kpabe.genparams;

import cn.edu.buaa.crypto.algebra.genparams.PairingEncryptionGenerationParameter;
import cn.edu.buaa.crypto.algebra.serparams.PairingKeySerParameter;
import cn.edu.buaa.crypto.chameleonhash.ChameleonHasher;
import cn.edu.buaa.crypto.utils.PairingUtils;
import it.unisa.dia.gas.jpbc.Element;

/**
 * Created by Weiran Liu on 2016/11/17.
 *
 * KP-ABE ciphertext generation parameter.
 */
public class KPABEEncryptionGenerationParameter extends PairingEncryptionGenerationParameter {
    private String[] attributes;
    private ChameleonHasher chameleonHasher;

    public KPABEEncryptionGenerationParameter(PairingKeySerParameter publicKeyParameter, String[] attributes, Element message) {
        super(publicKeyParameter, message);
        this.attributes = PairingUtils.removeDuplicates(attributes);
    }

    public KPABEEncryptionGenerationParameter(ChameleonHasher chameleonHasher,
            PairingKeySerParameter publicKeyParameter, String[] attributes, Element message) {
        super(publicKeyParameter, message);
        this.attributes = PairingUtils.removeDuplicates(attributes);
        this.chameleonHasher = chameleonHasher;
    }

    public String[] getAttributes() { return this.attributes; }

    public ChameleonHasher getChameleonHasher() {
        return this.chameleonHasher;
    }
}
