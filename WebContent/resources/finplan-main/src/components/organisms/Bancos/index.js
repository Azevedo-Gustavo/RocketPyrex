import Button from '../../atoms/Button'
import Input from '../../atoms/Input'
import Select from '../../atoms/Select'

import { bancos, contas } from '../../../utils/mock'

const Bancos = () => {
  return (
    <div className="py-4">
      <Input type="number" label="Valor" placeholder="Valor" />
      <Select label="Contas" placeholder="Contas">
        {contas.map(conta => (
          <option value={conta.id} key={conta.id}>
            {conta.description}
          </option>
        ))}
      </Select>
      <Select label="Bancos" placeholder="Bancos">
        {bancos.map(banco => (
          <option value={banco.id} key={banco.id}>
            {banco.description}
          </option>
        ))}
      </Select>
      <Input label="Descrição" placeholder="Descrição" />
      <Button>Continuar</Button>
    </div>
  )
}

export default Bancos
